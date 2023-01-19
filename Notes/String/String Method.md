## String 메소드

​          

```
charAt()
```

- 문자열의 index 위치의 문자 반환
- 해당 문자의 아스키 코드 값을 반환해주는 메소드
- charAt(i) ***- 48 또는 -'0'*** 해줘야 숫자로 받을 수 있음 

​            

```
codePointAt(int index)
```

- 주어진 index 위치의 코드 포인트(10진수 유니코드) 반환
- `str.codePointAt(index)`
- index값이 문자열 범위를 벗어날 경우, StringIndexOutOfBoundsException 발생

​             

```
codePointBefore(int index)
```

- 주어진 index 앞에 위치한 문자에 대한 코드 포인트 반환
- `str.codePointAt(0)` = `str.codePointBeforeAt(1)` 
- index값이 문자열 범위를 벗어날 경우, StringIndexOutOfBoundsException 발생

​               

```
codePointCount(int beginIndex, int endIndex)
```

- 문자열 특정 범위에서 유효한 유니코드 값 개수 반환
- begintIndex <= index < endIndex - 1

​             

```
compareTo(String str) / compareTo(Object obj)
```

- 두 개의 값을 비교해 int 값 반환

  - 같은 경우 0 반환
  - 다를 경우 문자열 길이의 차이 반환

- `str1.compareTo(str2)`

- ```java
  String str = "abcd";
  
  System.out.println(str.compareTo("ab"));	// 2
  System.out.println(str.compareTo("c"));		// -2  (97-99)
  System.out.println(str.compareTo("abfd"));	// -3  (97-100)
  System.out.println(str.compartTo("zefd"));	// -25 (97-122)
  ```

  - 같은 위치의 문자만 비교하기 때문에, 첫번째 문자부터 비교해서 다를 경우, 아스키 값 기준으로 비교에 반환
  - 비교 불가능한 시점에서 아스키 값 차이 반환

​              

```
compareToIgnoreCase(String str)
```

- 대소문자 무시하며 비교
- `str1.compareToIgnoreCase(str2)`
- `compareTo()`와 동일

​           

```
concat(String str)
```

- `str1.concat(str2)`
- str1에 str2를 연결

​           

```
contains(CharSequence chars)
```

- `str1.contains(str2)`
- str1에 str2가 포함되어 있는지 확인 후, true/false 반환

​           

```
getBytes()
```

- 문자열에 대하여 해당 문자열을 ***\*하나의 byte 배열로 변환\****해주는 메소드
- ***\- 48 또는 -'0'*** 해줘야 숫자로 받을 수 있음 

​             

```
indexOf()
```

- `str.indexOf(search, position)`
- 특정 문자열(search)를 찾고, 검색된 문자열이 **첫번째로 나타나는 위치 index를 return**
- 해당 문자열이 없으면 -1 return

​           

```
lastIndexOf()
```

- 마지막 index(0)에서 시작해 첫번째 index까지 검색

​          

```
length()
```

- 문자열 길이 반환

​           

```
replace()
```

- 바꾸고 싶은 문자로 문자열 치환
- `str = str.replace(target, replacement)`

​         

```
replaceAll()
```

- 바꾸고 싶은 문자로 문자열을 전부 치환

​             

```
substring()
toString()
equals(str)
```

- 대소문자 구분하면서 비교

​             

```
equalsIgnoreCase(str)
```

- 대소문자 구분없이 비교

​                

```
toUpperCase()` / `toLowerCase()
```

- 문자열을 대문자/소문자로 변경

​             

```
toCharArray()
```

- 문자열을 char[]으로 반환
- `str.toCharArray()`

​             

```
sort()
```

- 오름차순으로 배열 정렬
- `Arrays.sort(arr)`

​            

``` 
equals()
```

- 두 개의 배열 비교 후 true/false 반환
- `Arrays.equals(arr1,arr2)`

​               
