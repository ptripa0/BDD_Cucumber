package com.pelican.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;


public class HadoopUtil {

	/**
	 * Java SSH Connection Program
	 */
	public static String hiveDriverName = "org.apache.hive.jdbc.HiveDriver";
	
	
	public static Integer executeWrapper(String host, String user, String password, String command1) {
	    
	    try{
	    	
	    	java.util.Properties config = new java.util.Properties(); 
	    	config.put("StrictHostKeyChecking", "no");
	    	JSch jsch = new JSch();
	    	Session session=jsch.getSession(user, host, 22);
	    	session.setPassword(password);
	    	session.setConfig(config);
	    	session.connect();
	    	System.out.println("Connected");
	    	
	    	Channel channel=session.openChannel("exec");
	    	((ChannelExec)channel).setCommand(command1);
	        channel.setInputStream(null);
	        ((ChannelExec)channel).setErrStream(System.err);
	        
	        InputStream in=channel.getInputStream();
	        channel.connect();
	        byte[] tmp=new byte[1024];
	        while(true){
	          while(in.available()>0){
	            int i=in.read(tmp, 0, 1024);
	            if(i<0)break;
	            System.out.print(new String(tmp, 0, i));
	            
	     //      Hashtable<String, String> tbl = null;
	            
	          }
	          if(channel.isClosed()){
	            System.out.println("exit-status: "+channel.getExitStatus());
	            break;
	          }
	          try{Thread.sleep(1000);}catch(Exception ee){}
	        }
	        channel.disconnect();
	        session.disconnect();
	        System.out.println("DONE");
	        return channel.getExitStatus();
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		return null;
	}
	
	
	
	
	 
	public static ResultSet showTable(String dataStore, String datastoreConstring, String datastoreHivejdbcuser, String datastoreHivejdbcpw, String dataBase, String tableName) throws SQLException {
	      try {
	      Class.forName(hiveDriverName);
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	      System.exit(1);
	    }
	    //hive connection and name of the user the queries should run as
//	    Connection con = DriverManager.getConnection(datastoreConstring+"/"+dataBase, datastoreHivejdbcuser, datastoreHivejdbcpw);
	    Connection con = DriverManager.getConnection(datastoreConstring, datastoreHivejdbcuser, datastoreHivejdbcpw);
	    Statement stmt = con.createStatement();
	 //   String tableName = "qatesttable1";
	    
	    // show tables
	    String sql1 = "use '" + dataBase + "'";
	    String sql2 = "show tables";
	    System.out.println("Running: " + sql1 + " & " + sql2);
	    ResultSet res = stmt.executeQuery(sql2);
	   
	    
	 	   while (res.next()) {	   
	 		  System.out.println(res.getString(1));
	 	   }
		return res;
		        	
	  }

	


	  public static ResultSet describeTable(String dataStore, String datastoreConstring, String datastoreHivejdbcuser, String datastoreHivejdbcpw, String dataBase, String tableName) throws SQLException {
	      try {
	      Class.forName(hiveDriverName);
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	      System.exit(1);
	    }
	    //hive connection and name of the user the queries should run as
	    Connection con = DriverManager.getConnection(datastoreConstring, datastoreHivejdbcuser, datastoreHivejdbcpw);
	    Statement stmt = con.createStatement();
	    
	    
	    //describe table
	    String sql = "describe formatted " + tableName;
	    System.out.println("Running: " + sql);
	    ResultSet res = stmt.executeQuery(sql);
	    while (res.next()) {
	      System.out.println(res.getString(1) + "\t" + res.getString(2)+ "\t" + res.getString(3));
	    }
		return res;    
	  }
	  

	
/*	  
	  public static ResultSet executeHiveScript(String dataStore, String datastoreConstring, String datastoreHivejdbcuser, String datastoreHivejdbcpw, String dataBase, String tableName, String testBatchId, String hiveScript) throws SQLException {
	      try {
	      Class.forName(hiveDriverName);
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	      System.exit(1);
	    }
	    //hive connection and name of the user the queries should run as
//	    Connection con = DriverManager.getConnection(datastoreConstring+"/"+dataBase, datastoreHivejdbcuser, datastoreHivejdbcpw);
	    Connection con = DriverManager.getConnection(datastoreConstring, datastoreHivejdbcuser, datastoreHivejdbcpw);
	    Statement stmt = con.createStatement();
	    
	    // show tables
	   // String script = "hive --hiveconf dm.batch.id= '" + testBatchId + "'" + " -f "  + hiveScript;	    
	    String script = "source "  + hiveScript;
		System.out.println("Running: " + script);
	    ResultSet res = stmt.executeQuery(script);
	    
	 	   while (res.next()) {	   
	 		  System.out.println(res.getString(1));
	 	   }
		return res;
		        	
	  }
*/
	  
	  
	  public static Integer executeHiveScript(String host, String user, String password, String command1) {
		    
		    try{
		    	
		    	java.util.Properties config = new java.util.Properties(); 
		    	config.put("StrictHostKeyChecking", "no");
		    	JSch jsch = new JSch();
		    	Session session=jsch.getSession(user, host, 22);
		    	session.setPassword(password);
		    	session.setConfig(config);
		    	session.connect();
		    	System.out.println("Connected");
		    	
		    	Channel channel=session.openChannel("exec");
		    	((ChannelExec)channel).setCommand(command1);
		        channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();     
		        channel.connect();
		        
		/*        ReadableByteChannel in = Channels.newChannel(in1);
		        WritableByteChannel out = Channels.newChannel(System.out);
		        ByteBuffer buffer = ByteBuffer.allocate(65536);
		        while (in.read(buffer) != -1) {
		        buffer.flip( );
		        out.write(buffer);
		       

		       buffer.clear( );
		        }
		        
		        while (buffer.hasRemaining()) {
			        System.out.print((char) buffer.get());
			           	}
		       
		        
		        System.out.println("Start reading");
		
		        
		  //      BufferedReader reader = new BufferedReader(new InputStreamReader(in1));
		   //     String line = reader.readLine();
		        String stringSearch = "MapReduce Jobs Launched:";
		    //    List<String> list = new ArrayList<String>();
		     //   list.add(line);
		    //    list.contains(stringSearch);
		      //  if(list.contains(stringSearch)){
		       // 	System.out.println(list.size());
		       // }
		   
		        
		   //     while ((line2 = reader2.readLine()) != null){
		        	
		     //   	 if (line2.contains(stringSearch)) {
		       //          System.out.println(line2);
		        //     }}
		        
	//	        int linecount = 0;
	//	        File dstfile = new File(line);
		
	//	        BufferedReader reader2 = new BufferedReader(new FileReader(dstfile));
	//	        String line2;
	//	        while ((line2 = reader2.readLine()) != null){
		        	
	//	        	 if (line2.contains(stringSearch)) {
	//	                 System.out.println(line2);
	//	             }
		        	
		   //     	linecount++;
		   //         int indexfound = line2.indexOf(stringSearch);

		   //         if (indexfound > -1) 
		   //         {
		   //             System.out.println("Word is at position " + indexfound + " on line " + linecount);
		   //         }
		//        }
		 //       reader.close();
		 //       reader2.close();
		        
		      //  File f = new File(line);
		       // FileInputStream fstream = new FileInputStream(f);
		       // fstream.read();
		        
		        
		        System.out.println("Done reading");
		  //      channel.disconnect();
		       
		  */ 
		   //     InputStream in=channel.getInputStream();
		  //      channel.connect();
		        
		        
		        byte[] tmp=new byte[1024];
		        while(true){
		          while(in.available()>0){
		            int i=in.read(tmp, 0, 1024);
		            if(i<0)break;
		            String str = new String(tmp, 0, i);
		   	            
		            System.out.print(str);
		  
		            //      read job id
			 	
		          }         
		            if(channel.isClosed()){
		            System.out.println("exit-status: "+channel.getExitStatus());
		            break;
		          }
		          try{Thread.sleep(1000);}catch(Exception ee){}
		        }
		    
		        
		        
		        channel.disconnect();
		        session.disconnect();
		        System.out.println("DONE");
		        return channel.getExitStatus();
		    //    return in;
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
			return null;
		}
		
	  
	 //executePigScript 
	
	  public static Integer executePigScript(String host, String user, String password, String command1) {
		    
		    try{
		    	
		    	java.util.Properties config = new java.util.Properties(); 
		    	config.put("StrictHostKeyChecking", "no");
		    	JSch jsch = new JSch();
		    	Session session=jsch.getSession(user, host, 22);
		    	session.setPassword(password);
		    	session.setConfig(config);
		    	session.connect();
		    	System.out.println("Connected");
		    	
		    	Channel channel=session.openChannel("exec");
		    	((ChannelExec)channel).setCommand(command1);
		        channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();
		        channel.connect();
		        byte[] tmp=new byte[1024];
		        while(true){
		          while(in.available()>0){
		            int i=in.read(tmp, 0, 1024);
		            if(i<0)break;
		            System.out.print(new String(tmp, 0, i));
		            
		     //      Hashtable<String, String> tbl = null;
		            
		          }
		          if(channel.isClosed()){
		            System.out.println("exit-status: "+channel.getExitStatus());
		            break;
		          }
		          try{Thread.sleep(1000);}catch(Exception ee){}
		        }
		        channel.disconnect();
		        session.disconnect();
		        System.out.println("DONE");
		        return channel.getExitStatus();
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
			return null;
		}
		
		
	  
	  
	  
	  
	
	//executeSqoopCommand  
	  public static Integer executeSqoopCommand(String host, String user, String password, String command1) {
		    
		    try{
		    	
		    	java.util.Properties config = new java.util.Properties(); 
		    	config.put("StrictHostKeyChecking", "no");
		    	JSch jsch = new JSch();
		    	Session session=jsch.getSession(user, host, 22);
		    	session.setPassword(password);
		    	session.setConfig(config);
		    	session.connect();
		    	System.out.println("Connected");
		    	
		    	Channel channel=session.openChannel("exec");
		    	((ChannelExec)channel).setCommand(command1);
		        channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();
		        channel.connect();
		        byte[] tmp=new byte[1024];
		        while(true){
		          while(in.available()>0){
		            int i=in.read(tmp, 0, 1024);
		            if(i<0)break;
		            System.out.print(new String(tmp, 0, i));
		            
		     //      Hashtable<String, String> tbl = null;
		            
		          }
		          if(channel.isClosed()){
		            System.out.println("exit-status: "+channel.getExitStatus());
		            break;
		          }
		          try{Thread.sleep(1000);}catch(Exception ee){}
		        }
		        channel.disconnect();
		        session.disconnect();
		        System.out.println("DONE");
		        return channel.getExitStatus();
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
			return null;
		}
		
	  
	  /*
	  public static Integer shell(String host, String user, String password, String command1, String command2, String command3) {
		    
		    try{
		    	
		    	java.util.Properties config = new java.util.Properties(); 
		    	config.put("StrictHostKeyChecking", "no");
		    	JSch jsch = new JSch();
		    	Session session=jsch.getSession(user, host, 22);
		    	session.setPassword(password);
		    	session.setConfig(config);
		    	session.connect();
		    	System.out.println("Connected");
		    	
		    	Channel channel=session.openChannel("exec");
		    	((ChannelExec)channel).setCommand(command1);
		    	((ChannelExec)channel).setCommand(command2);
		    	((ChannelExec)channel).setCommand(command3);
		    	channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();
		        channel.connect();
		        byte[] tmp=new byte[1024];
		        while(true){
		          while(in.available()>0){
		            int i=in.read(tmp, 0, 1024);
		            if(i<0)break;
		            System.out.print(new String(tmp, 0, i));
		            
		     //      Hashtable<String, String> tbl = null;
		            
		          }
		          if(channel.isClosed()){
		            System.out.println("exit-status: "+channel.getExitStatus());
		            break;
		          }
		          try{Thread.sleep(1000);}catch(Exception ee){}
		        }
		        channel.disconnect();
		        session.disconnect();
		        System.out.println("DONE");
		        return channel.getExitStatus();
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
			return null;
		}
	  */
	  
}	
