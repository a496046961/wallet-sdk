## Central wallet 接入文档

#### 项目base链接
```bash
    https://
```
#### [项目Java的sdk github](https://github.com/a496046961/wallet-sdk)

## 提示
<p style="color: red;">所有的请求接口链接都要在Header设置apiKey,如果不带这个参数会报错。</p>

```rust
{"code":403,"message":"Not logged in ","status":false,"total":0}
```
<p style="color: red;">
apiKey在商户的后台配置值，注意配置环境是master、dev、test
</p>

---

## 用户相关
### 注册
接口链接：/account/register  
请求方式：POST

示例：http://www.baidu.com/account/register

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| userName | true | 用户名(手机号或者邮箱) | String |

返回
```rust
{"code":0,
"data":{"userId":12},
"message":"success",
"status":true,
"total":0}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| userId | 用户id | Long |

---

### 获取用户信息
接口链接：/account/getUserInfo  
请求方式：POST

示例：http://www.baidu.com/account/getUserInfo

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| userName | true | 用户名(手机号或者邮箱) | String |

返回
```rust
{"code":0,
"data":{"userId":12},
"message":"success",
"status":true,
"total":0}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| userId | 用户id | Long |

---

### 获取用户钱包地址
接口链接：/address/list  
请求方式：POST

示例：http://www.baidu.com/address/list

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| userId | true | 用户名Id(以上两个接口返回的userId) | Long |

返回
```rust
{"code":0,
"data":[
    {"address":"0x667ad28828fc3f008207b58641a15f798e67cd9e",
    "symbolId":3,
    "symbolName":"ETH"}
    ],
    "message":"success",
    "status":true,
    "total":128}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| address | 钱包地址 | String |
| symbolId | 币种id | Long |
| symbolName | 币种名称 | String |

---

## 币种相关
### 获取系统支持的币种
接口链接：/symbol/all  
请求方式：POST

示例：http://www.baidu.com/symbol/all

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| 无 |  |  |  |

返回
```rust
{
  "data": [
    {
      "name": "BTC",
      "contractAddress": "",
      "canRecharge": false,
      "canWithdraw": false,
      "enableRpc": false,
      "maxWithdrawAmount": 9999999.00000000,
      "minWithdrawAmount": null,
      "minerFee": 0.0010,
      "status": true,
      "decimal": 0,
      "imgUrl": "https://s2.northamericancoloniesindependence.com/logo/1/bitcoin.png?x-oss-process=style/coin_36_webp",
      "description": null,
      "projectSite": null,
      "fullName": "BitCoin"
    }
  ]
    "message":"success",
    "status":true,
     "code": 0,
    "total":128}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| name | 币种简称 | String |
| fullName | 币种全称 | String |
| contractAddress | 合约地址 | String |
| canRecharge | 是否开放充值 | boolean |
| canWithdraw | 是否开放提现 | boolean |
| enableRpc | 是否开放rpc | boolean |
| maxWithdrawAmount | 最大提现数量 | double |
| minWithdrawAmount | 最小提现数量 | double |
| minerFee | 最小提现手续费(最后结果以区块链实际手续费) | double |
| status | 状态 (true:可用 or false：关闭) | boolean |
| decimal | 精度 | int |
| imgUrl | 币种图标url | String |
| description | 币种简介 | String |
| projectSite | 项目官网 | String |

---

## 充值相关
### 获取充值列表
接口链接：/recharge
请求方式：POST

示例：http://www.baidu.com/symbol/recharge

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| status | 否  | 充值的状态 <font color=Red>1:创建 2:确认中 3:审核中 4:成功 5:失败 6:手动失败</font>  | int |
| userId | 否 | 用户id | Long |
| hash | 否 | 区块链交易hash | String |
| current | 否 | 当前页(默认第一页) | int |
| size | 否 | 一页多少条数据 (默认50条，最多100条)| int |
| coinName | 否 | 币种名称 | String |

返回
```rust
{
  "data": [
    {
      "id": 1784053684368449536,
      "fromAddress": "0xe9509d99f6e084bb8c1aa2dc7ddd843b031eeb78",
      "toAddress": "0x667ad28828fc3f008207b58641a15f798e67cd9e",
      "originalNumber": "100000000000000000",
      "transferNumber": 0.10000000,
      "hash": "0x14882b6f5a4162f9cd4dcc6fe3549b23d80224944353f90ea823441e395a016b",
      "blockHeightNumber": 5780633,
      "txTimestamp": 1714123104,
      "coinName": "ETH",
      "decimal": 1,
      "createDate": "2024-04-27T10:55:19",
      "updateDate": "2024-04-27T10:55:19",
      "status": 4,
      "userId": null
    }  
    ],
  "code": 0,
  "message": "success",
  "total": 15,
  "status": true
}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| id | 该数据的id | Long |
| fromAddress | 提现地址(来自钱包地址) | String |
| toAddress | 收款地址 | String |
| originalNumber | 原始充值数量 | Long(长度有20) |
| transferNumber | 交易数量 | double |
| hash | 交易hash | string |
| blockHeightNumber | 块高度 | int |
| txTimestamp | 区块链交易时间 | Long |
| coinName | 币种名称 | string |
| decimal | 精度 | int |
| createDate | 创建时间 | date |
| updateDate | 修改时间 | date |
| status | 状态 <font color=Red>1:创建 2:确认中 3:审核中 4:成功 5:失败 6:手动失败</font> | int |
| userId | 用户id | Long |

---

## 提现相关
### 提现
接口链接：/withdraw
请求方式：POST

示例：http://www.baidu.com/withdraw

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| requestId | true | 用户定义的订单号(订单号长度不能大于50) | String |
| fromAddress | true | 提现钱包 | String |
| toAddress | true | 收款钱包 | String |
| amount | true | 提现数量 | double |
| symbol | true | 币种 | String |
| parentSymbol | true | 父级币种 | String |

返回
```rust
{"code":0,
"data": null,
"message":"success",
"status":true,
"total":0}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| 无 |  |  |

---

### 提现列表
接口链接：/withdraw/withdraw-list
请求方式：POST

示例：http://www.baidu.com/withdraw/withdraw-list

参数
| 参数名     | 是否必须     | 说明     | 类型    
| -------- | -------- | -------- | -------- |
| requestId | false | 用户定义的订单号(订单号长度不能大于50) | String |
| fromAddress | false | 提现钱包 | String |
| toAddress | false | 收款钱包 | String |
| amount | false | 提现数量 | double |
| symbol | false | 币种 | String |
| userId | false | 用户id | Long |
| status | false | 状态<font color=Red> 0 未审核，1 审核通过，2 审核拒绝，3 支付中已经打币（未二次确认），4 支付失败，5 已完成，6 已撤销，7:归集，8:归集成功 </font> | Long |
| userId | false | 用户id | Long |
| hash | false | 交易hash | String |
| current | true | 当前页 | int |
| size | true | 一页多少条数据 | int |

返回
```rust
{
  "data": [
        {
      "requestId": "12286",
      "fromAddress": "0x667ad28828fc3f008207b58641a15f798e67cd9e",
      "toAddress": "0xe9509d99f6e084bb8c1aa2dc7ddd843b031eeb78",
      "amount": 20.000000,
      "symbol": "LINK",
      "hash": null,
      "createDate": "2024-04-29T19:59:21",
      "updateDate": "2024-05-10T11:03:57",
      "status": 4,
      "feeSymbol": null,
      "realFee": null,
      "remark": "Insufficient balance"
    }
  ],
  "code": 0,
  "message": "success",
  "total": 7,
  "status": true
}
```
| 返回参数        | 说明     | 类型    
| -------- | -------- | -------- |
| requestId | 商户订单号 | String |
| fromAddress | 提现地址| String |
| toAddress | 收款地址 | String |
| amount | 提现数量 | double |
| symbol | 币种名称 | String |
| hash | 区块链hash | String |
| createDate | 创建时间 | date |
| updateDate | 修改时间 | date |
| status | 状态 | int |
| feeSymbol | 手续费币种 | String |
| realFee | 手续费(最后以实际的手续费) | double |
| remark | 备注 | String |

---


