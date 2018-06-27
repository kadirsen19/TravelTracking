<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<head>
        <title>Seyehat Ve İzin Takip Modülü</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/matrix-login.css" />
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

    </head>
    <body>
        <div id="loginbox">            
            <form id="loginform" class="form-vertical" action="login" method="post">
				 <div class="control-group normal_text"> <h3>Seyahat Ve İzin Takip Modülü</h3></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><input required=" " type="text" name="username" placeholder="Kullanıcı Adı" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input required=" "  type="password" name="password" placeholder="Şifre" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
              		<button type="submit" class="btn btn-success">Giriş</button>
              		<button type="submit" class="btn btn-danger">İptal</button>
            	</div>
            </form>
        </div>
        <script src="js/jquery.min.js"></script>  
        <script src="js/matrix.login.js"></script> 
    </body>

</html>