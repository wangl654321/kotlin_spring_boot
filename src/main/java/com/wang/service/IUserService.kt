package com.debug.service

import com.wang.entity.UserInfo

/***
 *
*
* 描    述：
*
* 创 建 者： @author wl
* 创建时间： 2019/11/5 17:51
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
interface IUserService {

    fun findUserById(userId: Int): UserInfo

    fun saveUser(user: UserInfo)

    fun updateUser(user: UserInfo)

    fun removeUserById(user: UserInfo)
}