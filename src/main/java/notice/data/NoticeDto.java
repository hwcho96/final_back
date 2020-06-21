package notice.data;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;


public class NoticeDto {
	private int notice_num;
	private int notice_member_num;
	private String notice_subject;
	private String notice_content;
	private int notice_readcount;
	private List<MultipartFile> notice_file; //��������
	private String notice_filename;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Timestamp notice_writeday;
	public int getNotice_readcount() {
		return notice_readcount;
	}
	public void setNotice_readcount(int notice_readcount) {
		this.notice_readcount = notice_readcount;
	}
	
	public int getNotice_num() {
		return notice_num;
	}
	public void setNotice_num(int notice_num) {
		this.notice_num = notice_num;
	}
	public int getNotice_member_num() {
		return notice_member_num;
	}
	public void setNotice_member_num(int notice_member_num) {
		this.notice_member_num = notice_member_num;
	}
	public String getNotice_subject() {
		return notice_subject;
	}
	public void setNotice_subject(String notice_subject) {
		this.notice_subject = notice_subject;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public int getNotice_boardtype() {
		return notice_readcount;
	}
	public List<MultipartFile> getNotice_file() {
		return notice_file;
	}
	public void setNotice_file(List<MultipartFile> notice_file) {
		this.notice_file = notice_file;
	}
	public String getNotice_filename() {
		return notice_filename;
	}
	public void setNotice_filename(String notice_filename) {
		this.notice_filename = notice_filename;
	}
	public Timestamp getNotice_writeday() {
		return notice_writeday;
	}
	public void setNotice_writeday(Timestamp notice_writeday) {
		this.notice_writeday = notice_writeday;
	}
	@Override
	public String toString() {
		return "NoticeDto [notice_num=" + notice_num + ", notice_member_num=" + notice_member_num + ", notice_subject="
				+ notice_subject + ", notice_content=" + notice_content + ", notice_readcount=" + notice_readcount
				+ ", notice_file=" + notice_file + ", notice_filename=" + notice_filename + ", notice_writeday="
				+ notice_writeday + "]";
	}
	
	

	
	
	
}
