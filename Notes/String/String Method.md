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
