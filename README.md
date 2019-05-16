# RecaptchaInput

验证码输入控件

自定义属性说明：
```
        <attr name="num" format="integer" />   需要输入的验证码个数
        <attr name="child_h_padding" format="dimension"/>  横向padding
        <attr name="child_v_padding" format="dimension"/>  纵向padding
        <attr name="child_width" format="dimension"/> 框的宽度
        <attr name="child_height" format="dimension"/> 框的高度
        <attr name="textColor" format="color"/> 字体颜色
        <attr name="textSize" format="dimension"/> 字体大小
        <attr name="boxBackground" format="reference"/> 背景
        <attr name="inputType" format="string"/> 字符类型，支持number,text及password
        <attr name="pwdStr" format="string"/> 当类型为password，框中显示的字符
```

使用方法及步骤：
1.工程build.gradle添加
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
                        maven { url "http://jcenter.bintray.com"}
                        //注解掉jcenter()
		}
	}        
```
2.在子模块的build.gradle添加
```
implementation 'com.github.krystenia:RecaptchaInput:1.1'
```
3.配置文件中使用
```
<com.example.library.RecaptchaInputView
        android:id="@+id/input"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:boxBackground="@drawable/box_bg_shape"
        app:child_h_padding="15dp"
        app:textSize="18sp"
        app:num="4"/>
```

![image](https://github.com/krystenia/RecaptchaInput/blob/master/ezgif.com-video-to-gif.gif )  
