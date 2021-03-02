import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import TotalCommunityListPage from "../views/totalcommunity/TotalCommunityListPage";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home
  },
  {
    path: "/totalCommunity",
    name: "TotalCommunityListPage",
    components: {
      default: TotalCommunityListPage
    }
  }

  
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
