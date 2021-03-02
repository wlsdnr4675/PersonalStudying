<template>
  <div>
    <h3>게시판</h3>
    <table border="1">
      <tr>
        <th align="center" width="80">번호</th>
        <th align="center" width="80">분류</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">작성자</th>
        <th align="center" width="180">등록일자</th>
      </tr>

      <tr v-if="!totalCommunities || (Array.isArray(totalCommunities) && totalCommunities.length === 0)">
        <td colspan="5">
          List is empty
        </td>
      </tr>

      <!--값이 있으면 밑의 내용을 출력-->
      <tr v-else v-for="totalCommunity in totalCommunities" :key="totalCommunity.boardNo">
        <td align="center">{{ totalCommunity.boardNo }}</td>
        <td align="left">
          <router-link :to="{ name: 'TotalCommunityReadPage',
                        //boardNo=>router에서 props를 true로 지정했기 때문에 BoardReadPage에 boardNo이 트루로 들어감
                  params: { boardNo: totalCommunity.boardNo.toString() } }">
            {{ totalCommunity.title }}
          </router-link>
        </td>
        <td align="right">{{ totalCommunity.writer }}</td>
        <td align="center">{{ totalCommunity.regDate }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import {mapActions} from "vuex";
export default {
  name: "TotalCommunityList",
  props: {
    boards: {
      type: Array
    }
  },
  methods: {
    ...mapActions(['fetchTotalCommunityList'])
  },
  beforeCreate: function () {
    console.log("TotalCommunityList Before Create: ")
  },
  created: function () {
    console.log("TotalCommunityList Created: ")
  },
  beforeMount: function () {
    console.log("TotalCommunityList Before Mount: ")
  },
  mounted: function () {
    console.log("TotalCommunityList Mounted: " + this.boards)
  },
  beforeUpdate: function() {
    console.log("TotalCommunityList Before Update: ")
  },
  updated: function () {
    console.log("TotalCommunityList Updated: ")
  },
  beforeDestroy: function () {
    console.log("TotalCommunityList Before Destroy: ")
  },
  destroyed: function () {
    console.log("TotalCommunityList Destroyed: ")
  }
}
</script>

<style scoped>
</style>