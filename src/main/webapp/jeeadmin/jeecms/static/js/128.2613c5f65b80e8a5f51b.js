webpackJsonp([128],{N6H8:function(t,a,e){var i=e("kiPk");"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);e("FIqI")("29552c76",i,!0,{})},fx06:function(t,a,e){"use strict";function i(t){e("N6H8")}Object.defineProperty(a,"__esModule",{value:!0});var s=e("a3Yh"),r=e.n(s),n=e("2sCs"),o=e.n(n),d={data:function(){var t;return{dateArr:"",params:{type:"engine",target:"",flag:4,begin:"",statisDay:"",end:""},time:"",date:{year:"",month:"",day:""},totalMap:[],sum:0,ipsum:0,fksum:0,ipList:[],fkList:[],dataInfo:{pvTotal:0,visitorTotal:0,ipTotal:0,list:[]},chartLine:null,chartPie:null,chartLineOptions:{tooltip:{trigger:"axis"},legend:{data:[]},grid:{left:"5%",right:"5%",bottom:"14%"},xAxis:{type:"category",splitLine:{show:!1},boundaryGap:!0,data:["周一","周二","周三","周四","周五","周六","周日"]},yAxis:{splitLine:{show:!1},type:"value"},series:[]},chartPieOptions:{tooltip:{trigger:"item",formatter:"{a} <br/>{b} : {c} ({d}%)"},series:[(t={name:"来源分析",type:"pie",radius:"55%"},r()(t,"radius",["50%","70%"]),r()(t,"data",[]),t)],color:["#56dea0","#ffbe60","#fa99cb","#46d7e8","#86c0e9"]}}},methods:{rangeTime:function(t){null!=t?(this.params.begin=t[0],this.params.end=t[1],this.params.flag=3,t[0]===t[1]?this.time=t[0]:this.time=t[0]+"-"+t[1]):(this.params.begin="",this.params.end="",this.params.flag=4,this.time=this.date.year+"-"+this.date.month+"-"+this.date.day),this.getDataInfo()},query:function(t){this.dateArr="",this.params.begin="",this.params.end="",4===t&&(this.time=this.date.year+"-"+this.date.month+"-"+this.date.day),1===t&&(this.time=this.date.year+"-"+this.date.month),2===t&&(this.time=this.date.year),this.getDataInfo()},getDataInfo:function(){var t=this;o.a.post(this.$api.flowSourceList,this.params).then(function(a){var e=[],i=[],s=[];t.ipList=[],t.fkList=[];for(var r in a.body.keys){e.push(a.body.keys[r]);var n=0,o=0,d={},l={};for(var h in a.body.resultMap[e[r]])n+=a.body.resultMap[e[r]][h][1],o+=a.body.resultMap[e[r]][h][2],d[a.body.keys[r]]=n,l[a.body.keys[r]]=o;t.ipList.push(d),t.fkList.push(l)}t.ipsum=0,t.fksum=0;for(var p in t.ipList)t.ipsum+=t.ipList[p][e[p]],t.fksum+=t.fkList[p][e[p]];t.totalMap=a.body.totalMap,t.sum=0;for(var c in a.body.totalMap)t.sum+=a.body.totalMap[c];for(var m in e){var u=a.body.resultMap[e[m]];s[m]={name:e[m],type:"line",showSymbol:!1,smooth:!0,data:t.getChartSeriesData(u)}}i=t.getXdata(a.body.resultMap[e[0]]);var v=["",""];i=0==i.length?v:i;var f={legend:{data:e},xAxis:{data:i},series:s},y=t.getPieSeriesData(a.body.totalMap),_=[0];y=0==y.length?_:y;var g={series:[{name:"搜索引擎",data:y}]};t.chartLine.setOption(f),t.chartPie.setOption(g)})},getXdata:function(t){var a=[];for(var e in t)a.push(t[e][4]);return a},getChartSeriesData:function(t){var a=[];for(var e in t)a.push(t[e][0]);return a},getPieSeriesData:function(t){var a=[];for(var e in t)a.push({name:e,value:t[e]});return a}},created:function(){var t=new Date,a=t.getFullYear(),e=t.getMonth()+1,i=t.getDate();this.date.year=a,this.date.month=e,this.date.day=i,this.year=a,this.month=e,this.time=a+"-"+e+"-"+i,this.getDataInfo()},mounted:function(){this.chartLine=echarts.init(document.getElementById("chartLine")),this.chartLine.setOption(this.chartLineOptions),this.chartPie=echarts.init(document.getElementById("chartPie")),this.chartPie.setOption(this.chartPieOptions)}},l=function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("section",{staticClass:"cms-body cms-chart-box"},[e("div",{staticClass:"cms-list-header",staticStyle:{"padding-left":"0"}},[e("h5",{staticClass:"data-header-title"},[t._v("搜索引擎("+t._s(t.time)+")")]),t._v(" "),e("div",{staticClass:"flex-date"},[e("label",{staticClass:"cms-label",staticStyle:{"margin-left":"0"}},[t._v("日期：")]),t._v(" "),e("el-radio-group",{staticStyle:{"margin-right":"10px"},attrs:{size:"small"},on:{change:t.query},model:{value:t.params.flag,callback:function(a){t.$set(t.params,"flag",a)},expression:"params.flag"}},[e("el-radio-button",{attrs:{label:4}},[t._v("今日")]),t._v(" "),e("el-radio-button",{attrs:{label:1}},[t._v("本月")]),t._v(" "),e("el-radio-button",{attrs:{label:2}},[t._v("今年")])],1),t._v(" "),e("el-date-picker",{attrs:{"value-format":"yyyy-MM-dd",editable:!1,type:"daterange","range-separator":"至","start-placeholder":"开始日期","end-placeholder":"结束日期"},on:{change:t.rangeTime},model:{value:t.dateArr,callback:function(a){t.dateArr=a},expression:"dateArr"}})],1)]),t._v(" "),t._m(0),t._v(" "),e("table",{staticClass:"data-table"},[t._m(1),t._v(" "),e("tr",[e("td",[t._v("合计")]),t._v(" "),e("td",[t._v(t._s(t.sum))]),t._v(" "),e("td",[t._v(t._s(t.ipsum))]),t._v(" "),e("td",[t._v(t._s(t.fksum))])]),t._v(" "),t._l(t.totalMap,function(a,i,s){return e("tr",{key:i},[e("td",[t._v(t._s(i))]),t._v(" "),e("td",[t._v(t._s(a))]),t._v(" "),e("td",[t._v(t._s(t.ipList[s][i]))]),t._v(" "),e("td",[t._v(t._s(t.fkList[s][i]))])])})],2)])},h=[function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"flex"},[e("div",{staticClass:"chart-style",attrs:{id:"chartPie"}}),t._v(" "),e("div",{staticClass:"chart-style",attrs:{id:"chartLine"}})])},function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("tr",[e("th",[t._v("搜索引擎")]),t._v(" "),e("th",[t._v("pv总数")]),t._v(" "),e("th",[t._v("ip总数")]),t._v(" "),e("th",[t._v("访客总数")])])}],p={render:l,staticRenderFns:h},c=p,m=e("C7Lr"),u=i,v=m(d,c,!1,u,"data-v-20f62568",null);a.default=v.exports},kiPk:function(t,a,e){a=t.exports=e("UTlt")(!1),a.push([t.i,"\n.data-item[data-v-20f62568] {\n  float: left;\n  min-width: 170px;\n  margin-top: 30px;\n}\n.data-item .data-title[data-v-20f62568] {\n    font-size: 12px;\n    color: #878d99;\n    margin-bottom: 17px;\n}\n.data-item .data-num[data-v-20f62568] {\n    color: #353535;\n    font-size: 24px;\n}\n.chart-style[data-v-20f62568] {\n  width: 100%;\n  height: 380px;\n  border-bottom: 1px dashed #eee;\n  margin-bottom: 15px;\n}\n",""])}});