
import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';
import cookies from "vue-cookies";
import Layout from "@/views/common/Layout"

Vue.config.productionTip = false
Vue.use(cookies)

Vue.component('Header', Layout)

//스테이트 관리 위한 vuex 전역 변수
new Vue({
  router,
  store,
  vuetify,
  cookies,
  render: h => h(App)
}).$mount('#app')