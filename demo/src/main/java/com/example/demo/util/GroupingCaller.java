package com.example.demo.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class GroupingCaller {
	public static String callGroupingSvc(String strURL, String params) throws Exception {
		String result = null;

		URL url = new URL(strURL);// 创建连接
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		connection.setRequestMethod("POST"); // 设置请求方式
		connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
		connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
		connection.setRequestProperty("Accept-Encoding", "identity"); 
		connection.connect();
		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
		out.append(params);
		out.flush();
		out.close();
		// 读取响应
//		int length = (int) connection.getContentLength();// 获取长度 
		InputStream is = connection.getInputStream();
//		if (length != -1) {
//			byte[] data = new byte[length];
//			byte[] temp = new byte[512];
//			int readLen = 0;
//			int destPos = 0;
//			while ((readLen = is.read(temp)) > 0) {
//				System.arraycopy(temp, 0, data, destPos, readLen);
//				destPos += readLen;
//			}
//			result = new String(data, "UTF-8"); // utf-8编码
//
//		}
//		if(is!=null) {
		  //xuyue update 20200629 适配CHS分组器时发现connection.getContentLength()长度判断有问题，换成另外一种写法
	         ByteArrayOutputStream baos = new ByteArrayOutputStream();
	         byte[] buf = new byte[256];
	         int length = -1;
	         while((length = is.read(buf)) != -1){
	             baos.write(buf,0,length);
	         }
	         is.close();
	         result= new String(baos.toByteArray(),"UTF-8");// utf-8编码
//		}

		return result; // 自定义错误信息
	}

}
