<h1>内部类</h1>
<ul>
    <li>提高了封装程度</li>
    <li>提供更好地可读性和可维护性</li>
    <li>内部类使得多重继承的解决方案变得更加完整</li>
</ul>

<h3>静态内部类</h3>
<ul>
    <li>静态内部类可以有静态成员（方法，属性），而非静态内部类则不能有静态成员（方法，属性）</li>
    <li>静态内部类只能访问外部类的静态成员，而非静态类则可以访问所有成员</li>
    <li>实例化静态内部类，不依赖于外部类的实例，直接实例化内部类对象</li>
    <li>OutClassTest.InnerStaticClass inner = new OutClassTest.InnerStaticClass();</li>
</ul>
