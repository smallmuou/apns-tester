# apns-tester

为了使APNS的推送证书验证简单化，创建该Repo，自己亲测非常好用，关于证书的申请及操作步骤可查看[此文](http://wenva.github.io/apnstui-song-jing-cui)

### 客户端
使用xcode打开client/PushDemo，并修改BundleID即可，之后编译运行.

### 服务端
使用eclipse导入server/pusher，并修改src/Pusher.java如下内容
<pre>
String  p12Path = "p12路径";
String  p12Password = "p12密码";
String  pushToken = "APP远程注册后得到的DeviceToken";
</pre>

Run ...

### 许可
本代码遵循MIT许可.