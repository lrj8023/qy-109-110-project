package com.aaa.cancer.base;

import static com.aaa.cancer.status.LoginStatus.LOGIN_SUCCESS;

/**
 * @Company: AAA软件教育
 * @Author: Cancer:栗
 * @Date: Created in 2020/7/8 16:16
 * @Description:
 *      统一controller
 *        也就是说所有的controller都需要继承这个controller，进行统一返回
 *
 *          eg:
 *            登录成功和失败
 *            code:200 msg:登录成功
 *            code:400 msg:登录失败，系统异常
 *            code:201 msg:用户已经存在
 *            code:401 msg:用户不存在
 *  *         code:402 msg:密码错误
 *  *         code:405 msg:用户退出异常
 */
public class BaseController {
/**
 *@author: Cancer:栗
 *@description:
 *         登录成功
 *         使用系统消息
 *@param: []
 *@date: 16:35 2020/7/8
 *@return:
 *@throws:
 **/
    protected ResultData loginSuccess(){

        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;

    }
    /**
     *@author: Cancer:栗
     *@description:
     *            登录成功
     *            自定义返回消息
     *@param: []
     *@date: 16:42 2020/7/8
     *@return:
     *@throws:
     **/
    protected ResultData loinSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }
    /**
     *@author: Cancer:栗
     *@description:
     *           登录成功
     *           返回数据信息，使用系统消息
     *@param: []
     *@date: 16:44 2020/7/8
     *@return:
     *@throws:
     **/
    protected ResultData loginSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }
    /**
     *@author: Cancer:栗
     *@description:
     *          登录成功
     *          返回数据信息，自定义消息
     *@param: []
     *@date: 16:48 2020/7/8
     *@return:
     *@throws:
     **/
    protected ResultData loginSuccess(String msg, Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }
    /**
     *@author: Cancer:栗
     *@description:
     * 登录失败，使用系统消息
     *@param: []
     *@date: 16:54 2020/7/8
     *@return:
     *@throws:
     **/
    protected ResultData loginFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }
    protected ResultData loginFailed(String detail){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

}
