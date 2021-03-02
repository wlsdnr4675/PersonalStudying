<template>
  <form @submit.prevent="onSubmit">
    <h3>게시글 등록하기</h3>
    <table>
      <tr>
        <td>제목</td>
        <td><input type="text" v-model="title"></td>
      </tr>
      <tr>
        <td>분류</td>
        <td><input type="text" v-model="catalogue"></td>
      </tr>
      <tr>
        <td>작성자</td>
        <td><input type="text" v-model="writer"></td>
      </tr>
      <tr>
        <td>본문</td>
        <td><textarea v-model="content" rows="5"></textarea></td>
      </tr>
    </table>

    <div>
      <button type="submit">등록</button>
      <router-link :to="{ name: 'TotalCommunityListPage' }">
        취소
      </router-link>
    </div>
  </form>
</template>

<script>
export default {
  name: "TotalCommunityRegisterForm",
  data () {
    return {
      catalogue:'',
      title: '',
      writer: '',
      content: ''
    }
  },
  methods: {
    onSubmit () {
      const { catalogue, title, writer, content } = this
      this.$emit('submit', { catalogue, title, writer, content })
    }
  },
  beforeCreate: function () {
    console.log("TotalCommunityRegisterForm Before Create: ")
  },
  created: function () {
    console.log("TotalCommunityRegisterForm Created: ")
  },
  beforeMount: function () {
    console.log("TotalCommunityRegisterForm Before Mount: ")
  },
  mounted: function () {
    console.log("TotalCommunityRegisterForm Mounted: ")
  },
  beforeUpdate: function() {
    console.log("TotalCommunityRegisterForm Before Update: ")
  },
  updated: function () {
    console.log("TotalCommunityRegisterForm Updated: ")
  },
  beforeDestroy: function () {
    console.log("TotalCommunityRegisterForm Before Destroy: ")
  },
  destroyed: function () {
    console.log("TotalCommunityRegisterForm Destroyed: ")
  }
}
</script>

<style scoped>
</style>