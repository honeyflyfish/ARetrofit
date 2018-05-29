package com.sjtu.yifei.route;

import android.support.v4.app.Fragment;

import com.sjtu.yifei.annotation.Extra;
import com.sjtu.yifei.annotation.Go;
import com.sjtu.yifei.annotation.RequestCode;

/**
 * 类描述：
 * 创建人：yifei
 * 创建时间：2018/5/11
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public interface RouteService {

    @Go("/test-module1/Test1Activity")
    boolean launchTest1Activity(@Extra("para1") String para1, @Extra("para2") int para2);

    @Go("/test-module1/FragmentActivity")
    boolean launchFragmentActivity();

    @Go("/test-module1/Test1Activity")
    boolean launchTest1ActivityForResult(@Extra("para1") String para1, @Extra("para2") int para2, @RequestCode int requestCode);

    @Go("/test-module2/Test2Activity")
    boolean launchTest2Activity(@Extra("para1") String para1, @Extra("para2") int[] para2);

    @Go("/test-module2/TestFragment")
    Fragment getTestFragment(@Extra("param1") String para1, @Extra("param2") String para2);

    @Go("/provider/Test1Modul1IProvider")
    IProvider getTest1Modul1IProvider(@Extra("param1") String para1, @Extra("param2") int para2);

    @Go("/provider/Test2Modul2IProvider")
    IProvider getTest2Modul2IProvider(@Extra("param1") String para1, @Extra("param2") String para2);


}