package com.one.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {
	//得到随机i位数字
	public static String getDigits(Integer i) {
		Random rand = new Random();
		StringBuilder digit = new StringBuilder();
		for (int a = 0; a < i; a++) {
			digit.append(rand.nextInt(10));
		}
		return digit.toString();
	}
	//MD5加密
	public static String getMD5Str(String str) {
		byte[] digest = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("md5");
			digest  = md5.digest(str.getBytes("utf-8"));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new BigInteger(1, digest).toString(16);
	}
	//获取当前时间---格式yyyy-MM-dd HH:mm:ss
	public static String getUpdateTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	//模糊查询字符串
	public static String toLike(String name){
		return name==null?"%%":("%"+name+"%");
	}
}
