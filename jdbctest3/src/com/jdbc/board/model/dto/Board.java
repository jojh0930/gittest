package com.jdbc.board.model.dto;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Board {
	
	private int boardNO;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private Date boardDate;
	private List<BoardComment> comments;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int boardNO, String boardTitle, String boardContent, String boardWriter, Date boardDate) {
		super();
		this.boardNO = boardNO;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	public int getBoardNO() {
		return boardNO;
	}

	public void setBoardNO(int boardNO) {
		this.boardNO = boardNO;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	
	
	
	public List<BoardComment> getComments() {
		return comments;
	}

	public void setComments(List<BoardComment> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Board [boardNO=" + boardNO + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", boardDate=" + boardDate + ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardNO, boardTitle, boardWriter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(boardContent, other.boardContent) && boardNO == other.boardNO
				&& Objects.equals(boardTitle, other.boardTitle) && Objects.equals(boardWriter, other.boardWriter);
	}
	
	
}
