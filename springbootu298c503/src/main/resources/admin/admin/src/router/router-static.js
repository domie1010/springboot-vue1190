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
    import jiaoshibaoxiu from '@/views/modules/jiaoshibaoxiu/list'
    import weixiujindu from '@/views/modules/weixiujindu/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import weihuyuan from '@/views/modules/weihuyuan/list'
    import jieci from '@/views/modules/jieci/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import jiaoshishenqing from '@/views/modules/jiaoshishenqing/list'
    import jiaoshimingcheng from '@/views/modules/jiaoshimingcheng/list'
    import xueshengshenqing from '@/views/modules/xueshengshenqing/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/jiaoshibaoxiu',
        name: '教室报修',
        component: jiaoshibaoxiu
      }
      ,{
	path: '/weixiujindu',
        name: '维修进度',
        component: weixiujindu
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/weihuyuan',
        name: '维护员',
        component: weihuyuan
      }
      ,{
	path: '/jieci',
        name: '节次',
        component: jieci
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/jiaoshishenqing',
        name: '教师申请',
        component: jiaoshishenqing
      }
      ,{
	path: '/jiaoshimingcheng',
        name: '教室名称',
        component: jiaoshimingcheng
      }
      ,{
	path: '/xueshengshenqing',
        name: '学生申请',
        component: xueshengshenqing
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
