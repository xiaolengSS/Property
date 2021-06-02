<html>
    <head>
        <title></title>
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script type="text/javascript">
            $(function(){
                $("#register").click("click",function () {

                    // 1、构建表单数据域对象
                    var formData = new FormData();

                    // 2、收集数据
                    // 2.1、 上传的文件数据
                    var fileObj = $("input[name='touxiang']")[0].files[0];
                    // 2.2、 普通表单字段
                    var userName = $("input[name='username']").val();
                    var password = $("input[name='pwd']").val();

                    // 3、将获取到的普通字段的数据序列化
                    var user = JSON.stringify({"username": userName,"pwd": password});

                    // 4、将收集好的数据添加到formData域中
                    formData.append("touxiang",fileObj);
                    formData.append('user', new Blob([user], {type: "application/json"}));
                    $.ajax({
                        type: "POST",
                        url: '${pageContext.request.contextPath}/upload',
                        data: formData,
                        dataType:'text',
                        processData:false,
                        contentType:false,
                        success: function(data){
                            alert(data);
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <form>
            用户名：<input type="text" name="username"><br/>
            密码：<input type="password" name="pwd"><br/>
            头像：<input type="file" name="touxiang"><br/>
            <input id="register" type="button" value="注册"/>
        </form>
    </body>
</html>