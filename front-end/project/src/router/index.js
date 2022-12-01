import Vue from 'vue'
import Router from 'vue-router'
import login from '@/components/login'
import home from '@/components/home'
import PFhome from '@/components/physicalFile/PFhome'
import dishes from '@/components/dishesManagement/dishes'
import bedInfo from '@/components/bedManagement/bedInfo'
import estimateMode from '@/components/estimateManagement/estimateMode'
import estimateRecord from '@/components/estimateManagement/estimateRecord'
import clerk from '@/components/clerkManagement/clerk'
import servemodules from '@/components/servecomment/servemodules'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: login
    },
    {
      path: '/home',
      name: 'home',
      component: home,
      children:[{
        path: '/PFhome',
        name: 'PFhome',
        component: PFhome
      },
      {
        path: '/dishes',
        name: 'dishes',
        component: dishes
      },
      {
        path: '/bedInfo',
        name: 'bedInfo',
        component: bedInfo
      },
      {
        path: '/estimateMode',
        name: 'estimateMode',
        component: estimateMode
      },
      {
        path: '/estimateRecord',
        name: 'estimateRecord',
        component: estimateRecord
      },
      {
        path: '/clerk',
        name: 'clerk',
        component: clerk
      },
      {
        path: '/servemodules',
        name: 'servemodules',
        component: servemodules
      },
    ]
    },
  ]
})
