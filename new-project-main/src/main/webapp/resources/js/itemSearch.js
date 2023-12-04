 $(document).ready(function() {
    $("#searchForm").submit(function(event) {
      var itemName = $("#itemName").val().trim(); // 검색어 값 가져오기

      if (itemName === "") {
        alert("검색어를 입력해주세요."); // 검색어가 비어있을 때 경고창 표시
        event.preventDefault(); // 검색 폼 전송 막기
      }
    });
  });

