$(function(){

    $("table").css({"border":"1px solid red","margin":"0px auto"});

    // 登陆
    $("#download").unbind("click").bind("click", function(){
        var itemName=$("input[name=itemName]:checked").val();
        if(itemName==""||itemName==null){
            alert("请先选择一张图片再点击下载！");
            return false;
        }else{
            $.ajax({  // ajax登陆请求
                url:"http://localhost:8080/person/download",
                type:"post",
                data:{"itemName":itemName},
                async:false,
                success:function(res){
                    alert(res);
                }
            });
        }
    });

});