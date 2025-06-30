package com.itp.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player// implements InitializingBean,DisposableBean
{

		private int jno;
		private String pname;
		private int mp;
		private int rs;
		
		public Player() { System.out.println("No Args Constructor of Player Class");}
		public Player(int jno, String pname, int mp, int rs) {
			this.jno = jno;
			this.pname = pname;
			this.mp = mp;
			this.rs = rs;
		}
		public int getJno() {
			return jno;
		}
		public void setJno(int jno) {
			this.jno = jno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getMp() {
			return mp;
		}
		public void setMp(int mp) {
			this.mp = mp;
		}
		public int getRs() {
			return rs;
		}
		public void setRs(int rs) {
			this.rs = rs;
		}
		
		@Override
		public String toString() {
			return "Player [jno=" + jno + ", pname=" + pname + ", mp=" + mp + ", rs=" + rs + "]";
		}
//		@Override
//		public void afterPropertiesSet() throws Exception {
//		System.out.println("Immidiately After the Constructor");
//			
//		}
//		@Override
//		public void destroy() throws Exception {
//			System.out.println("Just Befroe the Destructor");
//			
//		}
		
	    @PostConstruct
		public void apple(){
		System.out.println("Immidiately After the Constructor using xml approach");	
		}
		
	    @PreDestroy
		public void mango(){
			System.out.println("Just Befroe the Destructor using xml approach");	
			}
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Destructor of Player Class");
		}
		
}
