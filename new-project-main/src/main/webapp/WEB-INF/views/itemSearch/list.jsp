<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <title>paging</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="/resources/css/itemlist.css" />
  <script type="text/javascript" src="/resources/js/itemSearch.js"></script>
  <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script> <!-- ajax 사용시 필수 -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <meta charset="UTF-8">
   <title>상품 목록</title>
</head>
<body>
         <!-- 검색조건 처리 -->
			<div class="row">
				<div class="col-lg-12">
					<form id="searchForm" action="/itemSearch/list" method="get">
						<select name="color" id="color">
							<option value="" >---</option>
							<option value="블랙" >블랙</option>
 							<option value="그레이" >그레이</option>
							<option value="차콜" >차콜</option>
							<option value="베이지" >베이지</option>
							<option value="그레이프" >그레이프</option>
							<option value="네이비" >네이비</option>
							<option value="코코아" >코코아</option>
							<option value="브라운" >브라운</option>
							<option value="카키" >카키</option>
							<option value="옐로우" >옐로우</option>
							<option value="그린" >그린</option>
							<option value="블루" >블루</option>
							<option value="바이올렛" >바이올렛</option>
							<option value="화이트" >화이트</option>
							<option value="올리브" >올리브</option>
							<option value="오렌지" >오렌지</option>
							<option value="아보카도" >아보카도</option>
							<option value="아이보리" >아이보리</option>
							<option value="레몬" >레몬</option>
							<option value="머스타드" >머스타드</option>
							<option value="코랄" >코랄</option>
							<option value="크림" >크림</option>
							<option value="라임" >라임</option>
							<option value="카멜" >카멜</option>
							<option value="망고" >망고</option>
							<option value="핑크" >핑크</option>
							<option value="레드" >레드</option>
							<option value="민트" >민트</option>
							<option value="초코" >초코</option>
							<option value="퍼플" >퍼플</option>
							<option value="오트밀" >오트밀</option>
						</select>
						
						<input type="text" name="itemName" value="${pageMaker.itemName}"/>
<%-- 						<input type="hidden" name="pageNum" value="${pageMaker.pageNum}"/>
						<input type="hidden" name="total" value="${pageMaker.total}"/> --%>
						
						<button class="btn btn-default">Search</button>
					</form>
				</div>			
			</div>         

         <!-- 검색조건 처리 -->
    <div class="container">    
  <ul class="nav justify-content-end">
    <li class="nav-item">
      <a class="nav-link" href="#">높은 가격순</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">낮은 가격순</a>
    </li>

  </ul>
</div>


    <div id="itemlist" class="prdlist_rollup">
            <c:forEach var="item" items="${list}">
                <li class="item">
                    <div class="box">
                        <div class="prdImg">
                            <a href="">
                                <img src="<c:url value='${item.mainImg}'/>" class="MS_prod_img_m thumb">
                            </a>
                        </div>
                        <div class="prd_info_box" id="prd_info_boxs" onclick="location.href='';" >
                            <div class="name">
                                <a href="">
                                    <font color="007cd8"><b>${item.itemName}</b></font>
                                </a>
                            </div>
                            <div class="list_info">
                                <ul>
                                    <li class="cash"><class="price" id="sale">${item.sale}원</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </li>
            </c:forEach>
    </div>
  </body>
    
    <!-- 페이징처리 -->
    <div class="pull-right">
        <ul class="pagination">
            <c:if test="${pageMaker.prev}">
                <li class="page-item"><a class="page-link" href="/itemSearch/list?pageNum=${pageMaker.startPage - 1}&color=${selectedColor}&itemName=${itemName}">Previous</a></li>
            </c:if>

            <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" varStatus="loop">
                <li class="page-item ${pageMaker.pageNum == num ? 'active' : ''}">
                    <a class="page-link" href="/itemSearch/list?pageNum=${num}&itemName=${itemName}">${num}</a>
                </li>
            </c:forEach>

            <c:if test="${pageMaker.next}">
                <li class="page-item"><a class="page-link" href="/itemSearch/list?pageNum=${pageMaker.endPage + 1}&color=${selectedColor}&itemName=${itemName}">Next</a></li>
            </c:if>
          </ul>
    </div>
    <!-- /페이징처리 -->
    
<%--           <form id="actionForm" action="" method="get">
          	<input type="hidden" name="total" value="${pageMaker.total}">
          	<input type="hidden" name="itemName" value="${pageMaker.itemName}">
          	<input type="hidden" name="color" value="${selectedColor}">
          </form>   --%>
</html>
