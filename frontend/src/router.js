
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AggAManager from "./components/listers/AggACards"
import AggADetail from "./components/listers/AggADetail"

import AggBManager from "./components/listers/AggBCards"
import AggBDetail from "./components/listers/AggBDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/aggAS',
                name: 'AggAManager',
                component: AggAManager
            },
            {
                path: '/aggAS/:id',
                name: 'AggADetail',
                component: AggADetail
            },

            {
                path: '/aggBS',
                name: 'AggBManager',
                component: AggBManager
            },
            {
                path: '/aggBS/:id',
                name: 'AggBDetail',
                component: AggBDetail
            },



    ]
})
