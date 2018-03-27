<h1>抽象类</h1>
<h3>如果一个类没有足够的信息来描述一个具体的对象，而需要其它具体的类来支撑它，那么这样的类我们称它为抽象类</h3>
<h3>注意</h3>
<ul>
    <li>抽象类不能被实例化，实例化工作应该交由它的子类来完成，它只需要一个引用即可</li>
    <li>抽象方法必须有子类重写</li>
    <li>抽象类可以包含具体的方法，当然也可以不包含抽象方法</li>
    <li>子类的抽象方法不能与父类的抽象方法同名</li>
    <li>abstract不能与final,static,private,native并列修饰同一个方法</li>
</ul>

<h1>接口</h1>
<h3>接口不是类，是抽象方法的集合<h3>
<h3>注意</h3>
<ul>
    <li>接口的所有方法自动被声明为public，也只能声明为public</li>
    <li>接口中可以定义“成员变量”，可以通过类命名直接访问：ImplementClass.name</li>
    <li>接口不存在实现的方法</li>
    <li>实现接口的非非抽象类必须实现该接口的所有方法</li>
</ul>