<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

.login-wrapper{
    width: 400px;
    height: 700px;
    padding: 40px;
    box-sizing: border-box;
    border: 2px solid lightgrey;
    border-radius: 10px;
    
    /* 가로 중앙 정렬을 위한 추가된 스타일 */
    margin: 0 auto; 
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}
.login-wrapper > h2{
    font-size: 30px;
    padding-bottom: 40px;
    color: #A6A6A6;
    margin-bottom: 20px;
    margin-top: 0px;
}
select {
    width: 230px; /* 원하는 가로 크기로 조정 (예: 200px) */
    padding: 5px; /* 내용과 경계 사이의 간격을 조절 (옵션) */
}
.info#info__birth {
	width: 10px;
    padding: 5px;
    display: flex;
}

</style>
</head>
<body>
	<div class="login-wrapper">
        <h2>ChoongAng</h2>
        <form method="post" action="url" id="login-form">
            아이디 : <input type="text" name="userId" placeholder="Id"> <input type="button" value="중복확인"> <p>
            비밀번호 : <input type="password" name="userPw" placeholder="Password"><p>
            비밀번호 확인 : <input type="password" name="userPw" placeholder="Password"><p>
            이름 : <input type="text" name="userName"><p>
            소속 : <select>
				    <option>이대점</option>
				    <option>강남점</option>
			</select><p>
			<select>
				    <option>501</option>
				    <option>502</option>
			  		<option>601</option>
			  		<option>602</option>
			</select><p>
            성별 : <input type="checkbox"> 남 <input type="checkbox"> 여<p>
            전화번호 : <input type="text" name="cellphone" placeholder="010-xxxx-xxxx"><p>
            이메일 : <input type="text" name="user_email" placeholder="ID@Email.com"><p>       
            주소 : <input type="text" name="address"><p>           
            생년월일 : <div class="info" id="info__birth">
					  <select class="box" id="birth-year">
					    <option disabled selected>출생 연도</option>
					  </select>
					  <select class="box" id="birth-month">
					    <option disabled selected>월</option>
					  </select>
					  <select class="box" id="birth-day">
					    <option disabled selected>일</option>
					  </select>
					</div> 
        <a href="메인.html"><input type="button" value="가입하기" style="float: right"></a>
  			
  		</form>
        
    </div>

</body>
</html>