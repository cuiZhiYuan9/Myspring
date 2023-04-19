package com.cui.JsonAPI;


/*{
  "resultcode":"200",
  "reason":"Success",
  "result":{
    "data":[
      {
        "id":"6269",
        "title":"羊肉汤",
        "tags":"增强抵抗力;煮;家常菜;汤;鲁菜",
        "imtro":"邹城人有喝羊汤的习惯，春夏秋冬羊汤馆总断不了食客，春秋天气候干燥要喝，夏天入伏要喝“伏羊汤”，阴冷的冬季尤其要喝碗羊汤才够温暖。以至于邀友喝羊汤成为了礼仪；“二哥，晚上咱们喝羊汤去”。邹城的羊汤铺遍地开花，以至于单县羊汤、滕州羊汤在邹城都没有了用武之地。我们这里的羊汤做法是最纯的，基本不放煮肉的香料，就用羊骨和羊肉煮成，“肉嫩汤浓”是其特色。 煮羊汤要先煮羊骨，把羊骨斩成大段焯水后放一点羊板油用细火煮，煮到汤白味浓时放入羊肉。羊肉煮到用筷子能轻松插穿时就要捞出，久煮的话羊肉过烂就失去了软嫩的口感。 碗里放入葱花或蒜粒，调入精盐，放入切的薄薄的羊肉片。把烧的滚开的羊汤盛到碗里，洒上香菜，再挖上一匙子香辣的用羊油泼成的辣椒油，一个字“香”！",
        "ingredients":"山羊肉,500g;羊骨,1000g",
        "burden":"生姜,适量;精盐,适量;香菜,适量;大葱,适量;辣椒油,适量;羊板油,适量",
        "albums":[
          "http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/t\/7\/6269_379835.jpg"
        ],
        "steps":[
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_95d65e77b58a1b6b.jpg",
            "step":"1.羊脊骨洗净用刀斩成段。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_a8136c10401a1643.jpg",
            "step":"2.煮锅里倒入清水，放入羊脊骨，羊肉煮开后捞出。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_c7b1c9fc85ddc6de.jpg",
            "step":"3.煮锅里倒入开水，放入羊脊骨生姜块大火煮开后改小火。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_2b284dc30b4f0875.jpg",
            "step":"4.小火煮40分钟，煮至汤色发白。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_c7ade6439eb2db5a.jpg",
            "step":"5.放入羊肉，加入适量的羊板油小火煮30分钟。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_579748e3b0f15963.jpg",
            "step":"6.捞出煮好的羊肉，晾凉后切薄片。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_1550e6f127aa1077.jpg",
            "step":"7.碗里放入葱花，调入精盐。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_a2c965d77b96da70.jpg",
            "step":"8.放入羊肉片，把滚开的羊汤倒入碗里洒上香菜末。"
          },
          {
            "img":"http:\/\/juheimg.oss-cn-hangzhou.aliyuncs.com\/cookbook\/s\/63\/6269_eea9b807d1dc5995.jpg",
            "step":"9.可以根据喜好调入陈醋放入蒜粒，最后调入辣椒油即可。"
          }
        ]
      }
    ],
    "totalNum":"9",
    "pn":0,
    "rn":"1"
  },
  "error_code":0
}
*/
public class Response {

    private String resultcode;
    private String reason;
    private ResultBean result;

    private String error_code;


}
