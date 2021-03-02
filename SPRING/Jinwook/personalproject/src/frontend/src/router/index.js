import Vue from "vue";
import VueRouter from "vue-router";
import TotalCommunityListPage from "@/views/totalcommunity/TotalCommunityListPage";
import TotalCommunityRegisterPage from "@/views/totalcommunity/TotalCommunityRegisterPage";

Vue.use(VueRouter);

const routes = [
  {
    path: "/totalCommunity/list",
    name: "TotalCommunityListPage",
    component: TotalCommunityListPage
  },
  {
    path: "/totalCommunity/create",
    name: "TotalCommunityRegisterPage",
    component: TotalCommunityRegisterPage
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
