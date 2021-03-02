<template>
    <div id="totalCommunity">
        <h2>TotalCommunity List</h2>
        <router-link :to="{name: 'TotalCommunityRegisterPage'}">
            글쓰기
        </router-link>
        <total-community-list :totalCommunities="totalCommunities"/>
    </div>
</template>

<script>
import TotalCommunityList from "@/components/totalcommunity/TotalCommunityList"
import {mapState, mapActions } from 'vuex';
    export default {
        name: 'TotalCommunityListPage',
        components:{
            TotalCommunityList
        },
        computed: {
            ...mapState(['totalCommunities'])
        },
        methods: {
    ...mapActions(['fetchTotalCommunityList'])
  },
   beforeCreate: function () {
    console.log("TotalCommunityRegisterPage Before Create: " + this.totalCommunities)
  },
  created: function () {
    console.log("TotalCommunityRegisterPage Created: " + this.totalCommunities)
  },
  beforeMount: function () {
    console.log("TotalCommunityRegisterPage Before Mount: ")
  },
  mounted () {
    this.fetchTotalCommuninyList()
    console.log("TotalCommunityRegisterPage Mounted: " + this.fetchTotalCommuninyList())
  },
  
  beforeUpdate: function() {
    console.log("TotalCommunityRegisterPage Before Update: " + this.boards)
  },
  updated: function () {
    console.log("TotalCommunityRegisterPage Updated: " + this.boards)
  },
  beforeDestroy: function () {
    console.log("TotalCommunityRegisterPage Before Destroy:" + this.boards)
  },
  destroyed: function () {
    console.log("TotalCommunityRegisterPage Destroyed: " + this.boards)
  }
}
</script>
