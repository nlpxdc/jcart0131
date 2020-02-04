## 0.1 图片上传

URL: /image/upload  
Method：POST  
Request Content-Type: multipart/formdata  
RequestParam: image  

ResponseBody:  
```json
xxx.jpg
```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| image   | String   | 上传图片    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | String   | 上传图片后Url    |

## 1.1 查询管理员列表

URL: /administrator/index?pageNum={pageNum}  
Method：GET  

ResponseBody:  
```json
{
    "total": 13,
    "pageNum": 2,
    "pageSize": 10,
    "list": [
        {
            "administratorId": 1234,
            "username": "user01",
            "status": 1,
            "createTime": 1580784600372
        },
        {
            "administratorId": 1235,
            "username": "user02",
            "status": 0,
            "createTime": 1580784711504
        }
    ]
}
```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| pageNum   | Integer   | 当前页码    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| total   | Integer   | 总数    |
| pageNum   | Integer   | 当前页码    |
| pageSize   | Integer   | 一页数量    |
| list   | Array   | 列表数据    |
| administratorId   | Integer   | 管理员Id    |
| username   | String   | 用户名    |
| status   | Byte   | 状态    |
| createTime   | Long   | 创建时间    |

## 1.2 创建管理员

URL: /administrator/create  
Method：POST  

RequestBody:  
```json
{
    "username": "user01",
    "realName": "张三",
    "mobile": "13234567890",
    "email": "aa@qq.com",
    "password": "123456",
    "status": 1,
    "avatarUrl": "xxx.jpg"
}
```

ResponseBody:  
```json
123456

```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| username   | String   | 用户名    |
| realName   | String   | 真实姓名    |
| mobile   | String   | 手机    |
| email   | String   | 邮箱    |
| password   | String   | 密码    |
| status   | Byte   | 状态    |
| avatarUrl   | String   | 头像Url    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 管理员Id    |

## 1.3 更新管理员

URL: /administrator/update  
Method：POST  

RequestBody:  
```json
{
    "administratorId": 123456,
    "username": "user01",
    "realName": "张三",
    "mobile": "13234567890",
    "email": "aa@qq.com",
    "password": "123456",
    "status": 1,
    "avatarUrl": "xxx.jpg"
}
```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| administratorId   | Integer   | 管理员Id    |
| username   | String   | 用户名    |
| realName   | String   | 真实姓名    |
| mobile   | String   | 手机    |
| email   | String   | 邮箱    |
| password   | String   | 密码    |
| status   | Byte   | 状态    |
| avatarUrl   | String   | 头像Url    |
