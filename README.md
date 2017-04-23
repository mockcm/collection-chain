# collection-chain
Java List链式操作，Map链式操作，Set链式操作

# 说明
Java中的集合是没有链式操作的，有时候在项目在写大量的add、put,而调用对象都是同一个，大量的add、put看起来会觉得很别扭，如果能做到链式操作，看起来应该会更优雅~   
上面提供了List、Set、Map的链式操作源码，使用也很简单，大家有兴趣的可以copy下来试试。   

# 使用
- List
```
List<String> strList = ListBuilder.build(String.class)
				.add("str1").add("str2")
				.get();
 
或者：
List<String> strList = new ListBuilder<String>()
			.add("str1").add("str2")
			.get();
```

- map
```
Map<String,Object> map = new MapBuilder<String,Object>()
					.put("key", "value")
					.get();
          
或者：
Map<String,Object> map = MapBuilder.buildHashMap(String.class, Object.class)
				.put("key", "value")
				.get();
```
- set
```
Set<Person> personSet = SetBuilder.build(Person.class)
				.add(new Person("zs", 23)).add(new Person("ls", 25)).get();
        
或者：
Set<Person> personSet = new SetBuilder<Person>()
				.add(new Person("zs", 23)).add(new Person("ls", 25)).get();
        
```
