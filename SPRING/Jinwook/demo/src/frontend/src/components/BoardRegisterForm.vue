<template>
  <form @submit.prevent="onSubmit">
    <h3>게시글 등록하기</h3>
    <table>
      <tr>
        <td>제목</td>
        <td><input type="text" v-model="title"></td>
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
      <router-link :to="{ name: 'BoardListPage' }">
        취소
      </router-link>
    </div>
  </form>
</template>

<script>
export default {
  name: "BoardRegisterForm",
  data () {
    return {
      title: '',
      writer: '',
      content: ''
    }
  },
  methods: {
    onSubmit () {
      const { title, writer, content } = this
      this.$emit('submit', { title, writer, content })
    }
  },
  beforeCreate: function () {
    console.log("BoardRegisterForm Before Create: ")
  },
  created: function () {
    console.log("BoardRegisterForm Created: ")
  },
  beforeMount: function () {
    console.log("BoardRegisterForm Before Mount: ")
  },
  mounted: function () {
    console.log("BoardRegisterForm Mounted: ")
  },
  beforeUpdate: function() {
    console.log("BoardRegisterForm Before Update: ")
  },
  updated: function () {
    console.log("BoardRegisterForm Updated: ")
  },
  beforeDestroy: function () {
    console.log("BoardRegisterForm Before Destroy: ")
  },
  destroyed: function () {
    console.log("BoardRegisterForm Destroyed: ")
  }
}
</script>

<style scoped>
</style>