<template>
  <div align="center">
    <h2>게시글 등록</h2>
    <board-register-form @submit="onSubmit"/>
  </div>
</template>

<script>
import TotalCommunityRegisterForm from "@/components/totalcommunity/TotalCommunityRegisterForm"
import axios from "axios"
export default {
  name: 'TotalCommunityRegisterPage',
  components: {
    TotalCommunityRegisterForm
  },
  methods: {
    onSubmit (payload) {
      console.log('TotalCommunityRegisterPage onSubmit()')
      const { catalogue, title, content, writer } = payload
      axios.post('http://localhost:8888/totalCommunities', { catalogue, title, writer, content })
        .then(res => {
          console.log(res)
          alert('Register Success')
          this.$router.push({
            name: 'TotalCommunityReadPage',
            params: { boardNo: res.data.boardNo.toString() }
          })
        })
        .catch(err => {
          alert(err.response.data.message)
        })
    }
  },
  beforeCreate: function () {
    console.log("TotalCommunityRegisterPage Before Create: ")
  },
  created: function () {
    console.log("TotalCommunityRegisterPage Created: ")
  },
  beforeMount: function () {
    console.log("TotalCommunityRegisterPage Before Mount: ")
  },
  mounted: function () {
    console.log("TotalCommunityRegisterPage Mounted: ")
  },
  beforeUpdate: function() {
    console.log("TotalCommunityRegisterPage Before Update: ")
  },
  updated: function () {
    console.log("TotalCommunityRegisterPage Updated: ")
  },
  beforeDestroy: function () {
    console.log("TotalCommunityRegisterPage Before Destroy: ")
  },
  destroyed: function () {
    console.log("TotalCommunityRegisterPage Destroyed: ")
  }
}
</script>

<style scoped>
</style>