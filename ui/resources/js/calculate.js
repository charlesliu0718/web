$(function(){

    $("table").css({"border":"1px solid red","margin":"0px auto"});

    // 登陆
    $("#cal").unbind("click").bind("click", function(){
        var num1=$("input[name=num1]").val();
        var num2=$("input[name=num2]").val();
        if(num1==""||num1==null){
            alert("第一个数不能为空！");
            return false;
        }else if(num2==""||num2==null){
            alert("第二个数不能为空！");
            return false;
        }else{
            $.ajax({  // ajax登陆请求
                url:"http://111.231.138.94:8080/person/calculate",
                type:"post",
                data:{"num1":num1,"num2":num2},
                async:false,
                success:function(res){
                    alert(res);
                }
            });
        }
    });

});