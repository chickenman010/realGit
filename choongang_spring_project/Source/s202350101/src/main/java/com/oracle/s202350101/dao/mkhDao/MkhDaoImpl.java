package com.oracle.s202350101.dao.mkhDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.s202350101.model.BdFree;
import com.oracle.s202350101.model.BdQna;
import com.oracle.s202350101.model.ClassRoom;
import com.oracle.s202350101.model.PrjBdData;
import com.oracle.s202350101.model.PrjBdRep;
import com.oracle.s202350101.model.UserInfo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MkhDaoImpl implements MkhDao {
	
	private final SqlSession session;

	@Override
	public int insertUserInfo(UserInfo userInfo) {
		int result = 0;
		System.out.println("MkhDaoImpl insert Start...");
		try {
			result = session.insert("InsertUserInfo", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl insert Exception->" +e.getMessage());
		}
		return result;
	}

	@Override
	public List<ClassRoom> createdClass() {
		List<ClassRoom> classList = null;
		System.out.println("MkhDaoImpl createdClass start...");
		try {
			// ClassRoom의 class_id와 class_room_num만 select
			classList = session.selectList("createdClassSelect");
		} catch (Exception e) {
			System.out.println("MkhDaoImpl createdClass Exception->" +e.getMessage());
		}
		return classList;
	}


	@Override
	public int totalBDcount(UserInfo userInfo) {
		int totalBDCount = 0;
		System.out.println("MkhDaoImpl totalBDcount start...");
		try {
			totalBDCount = session.selectOne("totalBDListCount", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl totalBDcount Exception->" +e.getMessage());
		}

		return totalBDCount;
	}
	
	@Override
	public UserInfo userLoginCheck(UserInfo userInfo) {
		UserInfo userConfirm = null;
		System.out.println("MkhDaoImpl userLoginCheck start...");
		try {
			userConfirm = session.selectOne("userLoginConfirm", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl userLogin Exception->"+e.getMessage());
		}
		
		return userConfirm;
	}
	
	@Override
	public List<BdQna> bdQnaList(UserInfo userInfo) {
		List<BdQna> qnaList = null;
		System.out.println("MkhDaoImpl bdQnaList start...");
		try {
			// user_id에 해당하는 게시물, count 출력 sql
			qnaList = session.selectList("QnaListSelect", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl bdQnaList Exception->" +e.getMessage());
		}
		return qnaList;
	}

	@Override
	public List<BdFree> bdFreeList(UserInfo userInfo) {
		List<BdFree> freeList = null;
		System.out.println("MkhDaoImpl bdFreeList start...");
		try {
			// user_id에 해당하는 게시물, count 출력 sql
			freeList = session.selectList("FreeListSelect", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl bdFreeList Exception->" +e.getMessage());
		}
		return freeList;
	}

	@Override
	public List<PrjBdData> prjDataList(UserInfo userInfo) {
		List<PrjBdData> dataPrjList = null;
		System.out.println("MkhDaoImpl PrjDataList start...");
		try {
			// user_id에 해당하는 게시물, count 출력 sql
			dataPrjList = session.selectList("DataListSelect", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl PrjDataList Exception->" +e.getMessage());
		}
		return dataPrjList;
	}

	@Override
	public List<PrjBdRep> prjRepList(UserInfo userInfo) {
		List<PrjBdRep> RepPrjList = null;
		System.out.println("MkhDaoImpl PrjRepList start...");
		try {
			// user_id에 해당하는 게시물, count 출력 sql
			RepPrjList = session.selectList("RepListSelect", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl PrjRepList Exception->" +e.getMessage());
		}
		return RepPrjList;
	}

	@Override
	public UserInfo confirm(String user_id) {
		System.out.println("MkhDaoImpl confirm start...");
		UserInfo userInfo = new UserInfo();
		try {
			userInfo = session.selectOne("IdConfirm", user_id);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl confirm Exception->"+e.getMessage());
		}
		return userInfo;
	}

	@Override
	public int totalQna(UserInfo userInfo) {
		int totalBdQna = 0;
		System.out.println("MkhDaoImpl totalQna start...");
		try {
			totalBdQna = session.selectOne("totalQnaCount", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl totalQna Exception->" +e.getMessage());
		}

		return totalBdQna;
	}

	@Override
	public int totalFree(UserInfo userInfo) {
		int totalBdFree = 0;
		System.out.println("MkhDaoImpl totalFree start...");
		try {
			totalBdFree = session.selectOne("totalFreeCount", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl totalFree Exception->" +e.getMessage());
		}

		return totalBdFree;
	}

	@Override
	public int totalDtPj(UserInfo userInfo) {
		int totalDtPrj = 0;
		System.out.println("MkhDaoImpl totalDtPj start...");
		try {
			totalDtPrj = session.selectOne("totalDtPjCount", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl totalDtPj Exception->" +e.getMessage());
		}

		return totalDtPrj;
	}

	@Override
	public int totalRepPj(UserInfo userInfo) {
		int totalRepPrj = 0;
		System.out.println("MkhDaoImpl totalRepPj start...");
		try {
			totalRepPrj = session.selectOne("totalRepPjCount", userInfo);
		} catch (Exception e) {
			System.out.println("MkhDaoImpl totalRepPj Exception->" +e.getMessage());
		}

		return totalRepPrj;
	}

}
