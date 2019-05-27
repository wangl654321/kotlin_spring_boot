package com.wang.controller

import com.debug.service.IUserService
import com.wang.entity.UserInfo
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2019/5/2713:56
 * 创建描述：
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
@RestController
class UserController {

    @Resource
    lateinit var userService: IUserService

    @RequestMapping("/getUserById")
    fun getUserById(req: HttpServletRequest): UserInfo {
        val id: Int = Integer.parseInt(req.getParameter("id"))
        val userInfo = userService.findUserById(id)
        return userInfo
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    fun saveUser(): String {
        val u = UserInfo(null,"蔡依林", "河南")
        userService.saveUser(u)
        return "保存成功"
    }


    @RequestMapping("/updateUser")
    @ResponseBody
    fun updateUser(): String {
        val u = UserInfo(3, "赵雅芝")
        userService.updateUser(u)
        return "修改成功"
    }

    @RequestMapping("/removeUserById")
    @ResponseBody
    fun removeUserById(): String {
        val u = UserInfo(4)
        userService.removeUserById(u)
        return "删除成功"
    }
}