import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes: Array<RouteConfig> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/upload_structure',
    name: 'UploadStructure',
    component: () => import(/* webpackChunkName: "about" */ '../views/UploadStructure.vue')
  },
  {
    path: '/upload_threats',
    name: 'UploadThreats',
    component: () => import(/* webpackChunkName: "about" */ '../views/UploadThreats.vue')
  },
  {
    path: '/view',
    name: 'View',
    component: () => import(/* webpackChunkName: "about" */ '../views/View.vue')
  },
  {
    path: '/incident',
    name: 'Incident',
    component: () => import(/* webpackChunkName: "about" */ '../views/Incident.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
