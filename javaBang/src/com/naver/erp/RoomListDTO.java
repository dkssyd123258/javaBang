package com.naver.erp;

public class RoomListDTO {
	private int sr_no;
	private String sr_mainaddr;
    private int s_no;
    private String sr_addrflow;
    private String sr_roomsize ;
    private String sr_builddate ;
    private String elv_available;
    private String hc_type;
    private String pet_available;
    
    
	public String getPet_available() {
		return pet_available;
	}
	public void setPet_available(String pet_available) {
		this.pet_available = pet_available;
	}
	public int getSr_no() {
		return sr_no;
	}
	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}
	public String getSr_mainaddr() {
		return sr_mainaddr;
	}
	public void setSr_mainaddr(String sr_mainaddr) {
		this.sr_mainaddr = sr_mainaddr;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getSr_addrflow() {
		return sr_addrflow;
	}
	public void setSr_addrflow(String sr_addrflow) {
		this.sr_addrflow = sr_addrflow;
	}
	public String getSr_roomsize() {
		return sr_roomsize;
	}
	public void setSr_roomsize(String sr_roomsize) {
		this.sr_roomsize = sr_roomsize;
	}
	public String getSr_builddate() {
		return sr_builddate;
	}
	public void setSr_builddate(String sr_builddate) {
		this.sr_builddate = sr_builddate;
	}
	public String getElv_available() {
		return elv_available;
	}
	public void setElv_available(String elv_available) {
		this.elv_available = elv_available;
	}
	public String getHc_type() {
		return hc_type;
	}
	public void setHc_type(String hc_type) {
		this.hc_type = hc_type;
	}
    
    
}


