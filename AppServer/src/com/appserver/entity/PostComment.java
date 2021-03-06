package com.appserver.entity;

import java.util.Date;
/**
 * 帖子评论的信息实体类
 *
 */
public class PostComment {

	/**
	 * 评论ID
	 */
	private int pCommentID;
	
	/**
	 * 评论内容
	 */
	private String pCommentContent;
	
	/**
	 * 评论时间
	 */
	private Date pCommentTime;
	
	/**
	 * 帖子ID
	 */
	private int postID;
	
	/**
	 * 会员ID
	 */
	private String memberID;

	public int getpCommentID() {
		return pCommentID;
	}

	public void setpCommentID(int pCommentID) {
		this.pCommentID = pCommentID;
	}

	public String getpCommentContent() {
		return pCommentContent;
	}

	public void setpCommentContent(String pCommentContent) {
		this.pCommentContent = pCommentContent;
	}

	public Date getpCommentTime() {
		return pCommentTime;
	}

	public void setpCommentTime(Date pCommentTime) {
		this.pCommentTime = pCommentTime;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
}
