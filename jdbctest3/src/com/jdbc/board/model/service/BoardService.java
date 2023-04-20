package com.jdbc.board.model.service;

import static com.jdbc.board.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.jdbc.board.model.dao.BoardDao;
import com.jdbc.board.model.dto.Board;

public class BoardService {
	
	private BoardDao dao=new BoardDao();
	
	public List<Board> selectBoardAll(){
		Connection conn=getConnection();
		List<Board> boards=dao.selectBoardAll(conn);
		for(Board b : boards) {
			b.setComments(dao.selectBoardComment(conn, b.getBoardNO()));
		}
		close(conn);
		return boards;
	}
	
	
}
