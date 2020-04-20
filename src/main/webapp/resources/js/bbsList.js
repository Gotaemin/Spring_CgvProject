/**
 * 
 */


	$("#btn-next").click(function() {
		location.href='./boardList?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}';
	});
	
	$("#btn-pre").click(function() {
		location.href='./boardList?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}';
	});
	
	$("#btn-first").click(function() {
		location.href='./boardList?curPage=1&kind=${pager.kind}&search=${pager.search}';
	});
	
	$("#btn-end").click(function() {
		location.href='./boardList?curPage=${pager.totalPage}&kind=${pager.kind}&search=${pager.search}';
	});

