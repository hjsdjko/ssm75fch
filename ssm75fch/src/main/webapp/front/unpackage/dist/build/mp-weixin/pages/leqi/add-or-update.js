(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/leqi/add-or-update"],{"079a":function(e,n,t){"use strict";(function(e){t("50a7");i(t("66fd"));var n=i(t("7fae"));function i(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},"0ba4":function(e,n,t){},3955:function(e,n,t){"use strict";t.r(n);var i=t("77de"),r=t.n(i);for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);n["default"]=r.a},"71b8":function(e,n,t){"use strict";var i=t("0ba4"),r=t.n(i);r.a},"77de":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var i=r(t("a34a"));function r(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,i,r,a,u){try{var o=e[a](u),c=o.value}catch(l){return void t(l)}o.done?n(c):Promise.resolve(c).then(i,r)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(i,r){var u=e.apply(n,t);function o(e){a(u,i,r,o,c,"next",e)}function c(e){a(u,i,r,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("6830"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{leqibianhao:"",leqimingcheng:"",fenlei:"",tupian:"",mingshiyanzou:"",leshimingcheng:"",guimo:"",leshiweizhi:"",leqixiangqing:""},fenleiOptions:[],fenleiIndex:0,leshimingchengOptions:[],leshimingchengIndex:0,user:{}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return u(i.default.mark((function r(){var a,u,o,c;return i.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return a=e.getStorageSync("nowTable"),r.next=3,t.$api.session(a);case 3:return u=r.sent,t.user=u.data,r.next=7,t.$api.option("leqifenlei","fenlei",{});case 7:return u=r.sent,t.fenleiOptions=u.data,r.next=11,t.$api.option("leshixinxi","leshimingcheng",{});case 11:if(u=r.sent,t.leshimingchengOptions=u.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid),!n.id){r.next=21;break}return t.ruleForm.id=n.id,r.next=19,t.$api.info("leqi",t.ruleForm.id);case 19:u=r.sent,t.ruleForm=u.data;case 21:if(!n.cross){r.next=55;break}o=e.getStorageSync("crossObj"),r.t0=i.default.keys(o);case 24:if((r.t1=r.t0()).done){r.next=55;break}if(c=r.t1.value,"leqibianhao"!=c){r.next=29;break}return t.ruleForm.leqibianhao=o[c],r.abrupt("continue",24);case 29:if("leqimingcheng"!=c){r.next=32;break}return t.ruleForm.leqimingcheng=o[c],r.abrupt("continue",24);case 32:if("fenlei"!=c){r.next=35;break}return t.ruleForm.fenlei=o[c],r.abrupt("continue",24);case 35:if("tupian"!=c){r.next=38;break}return t.ruleForm.tupian=o[c],r.abrupt("continue",24);case 38:if("mingshiyanzou"!=c){r.next=41;break}return t.ruleForm.mingshiyanzou=o[c],r.abrupt("continue",24);case 41:if("leshimingcheng"!=c){r.next=44;break}return t.ruleForm.leshimingcheng=o[c],r.abrupt("continue",24);case 44:if("guimo"!=c){r.next=47;break}return t.ruleForm.guimo=o[c],r.abrupt("continue",24);case 47:if("leshiweizhi"!=c){r.next=50;break}return t.ruleForm.leshiweizhi=o[c],r.abrupt("continue",24);case 50:if("leqixiangqing"!=c){r.next=53;break}return t.ruleForm.leqixiangqing=o[c],r.abrupt("continue",24);case 53:r.next=24;break;case 55:t.styleChange();case 56:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},leshimingchengChange:function(e){var n=this;return u(i.default.mark((function t(){var r;return i.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n.leshimingchengIndex=e.target.value,n.ruleForm.leshimingcheng=n.leshimingchengOptions[n.leshimingchengIndex],t.next=4,n.$api.follow("leshixinxi","leshimingcheng",{columnValue:n.ruleForm.leshimingcheng});case 4:r=t.sent,r.data.guimo&&(n.ruleForm.guimo=r.data.guimo),r.data.leshiweizhi&&(n.ruleForm.leshiweizhi=r.data.leshiweizhi);case 7:case"end":return t.stop()}}),t)})))()},fenleiChange:function(e){this.fenleiIndex=e.target.value,this.ruleForm.fenlei=this.fenleiOptions[this.fenleiIndex]},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},mingshiyanzouTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.mingshiyanzou=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(i.default.mark((function n(){return i.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.leqibianhao){n.next=3;break}return e.$utils.msg("乐器编号不能为空"),n.abrupt("return");case 3:if(e.ruleForm.leqimingcheng){n.next=6;break}return e.$utils.msg("乐器名称不能为空"),n.abrupt("return");case 6:if(e.ruleForm.fenlei){n.next=9;break}return e.$utils.msg("分类不能为空"),n.abrupt("return");case 9:if(!e.ruleForm.id){n.next=14;break}return n.next=12,e.$api.update("leqi",e.ruleForm);case 12:n.next=16;break;case 14:return n.next=16,e.$api.add("leqi",e.ruleForm);case 16:e.$utils.msgBack("提交成功");case 17:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),i=n.getMonth()+1,r=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,r=r>9?r:"0"+r,"".concat(t,"-").concat(i,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},"7fae":function(e,n,t){"use strict";t.r(n);var i=t("9a9f"),r=t("3955");for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);t("71b8");var u,o=t("f0c5"),c=Object(o["a"])(r["default"],i["b"],i["c"],!1,null,"17843900",null,!1,i["a"],u);n["default"]=c.exports},"9a9f":function(e,n,t){"use strict";var i;t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return i}));var r=function(){var e=this,n=e.$createElement;e._self._c},a=[]}},[["079a","common/runtime","common/vendor"]]]);