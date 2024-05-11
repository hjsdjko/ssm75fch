import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussleshixinxi from '@/views/modules/discussleshixinxi/list'
    import leqizhishi from '@/views/modules/leqizhishi/list'
    import leqi from '@/views/modules/leqi/list'
    import tuikuan from '@/views/modules/tuikuan/list'
    import storeup from '@/views/modules/storeup/list'
    import leqifenlei from '@/views/modules/leqifenlei/list'
    import yonghuyuyue from '@/views/modules/yonghuyuyue/list'
    import discussleqizhishi from '@/views/modules/discussleqizhishi/list'
    import quxiaoyuyue from '@/views/modules/quxiaoyuyue/list'
    import discussleqi from '@/views/modules/discussleqi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import leshixinxi from '@/views/modules/leshixinxi/list'
    import discussgonggaoxinxi from '@/views/modules/discussgonggaoxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import config from '@/views/modules/config/list'
    import yonghuliuyan from '@/views/modules/yonghuliuyan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/discussleshixinxi',
        name: '乐室信息评论',
        component: discussleshixinxi
      }
          ,{
	path: '/leqizhishi',
        name: '乐器知识',
        component: leqizhishi
      }
          ,{
	path: '/leqi',
        name: '乐器',
        component: leqi
      }
          ,{
	path: '/tuikuan',
        name: '退款',
        component: tuikuan
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/leqifenlei',
        name: '乐器分类',
        component: leqifenlei
      }
          ,{
	path: '/yonghuyuyue',
        name: '用户预约',
        component: yonghuyuyue
      }
          ,{
	path: '/discussleqizhishi',
        name: '乐器知识评论',
        component: discussleqizhishi
      }
          ,{
	path: '/quxiaoyuyue',
        name: '取消预约',
        component: quxiaoyuyue
      }
          ,{
	path: '/discussleqi',
        name: '乐器评论',
        component: discussleqi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/leshixinxi',
        name: '乐室信息',
        component: leshixinxi
      }
          ,{
	path: '/discussgonggaoxinxi',
        name: '公告信息评论',
        component: discussgonggaoxinxi
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yonghuliuyan',
        name: '用户留言',
        component: yonghuliuyan
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
