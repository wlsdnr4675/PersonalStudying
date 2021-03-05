<template>
  <div>
    <h3>수정 형식</h3>
    <form @submit.prevent="onSubmit">
      <table>
        <tr>
          <td>번호</td>
          <td><input type="text" :value="board.boardNo" disabled></td>
        </tr>
        <tr>
          <td>등록일자</td>
          <td><input type="text" :value="board.regDate" disabled></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><input type="text" v-model="title"></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="text" :value="board.writer" disabled></td>
        </tr>
        <tr>
          <td>본문</td>
          <td><textarea v-model="content" rows="5"></textarea></td>
        </tr>
      </table>

      <div>
        <button type="submit">수정</button>
        <router-link :to="{ name: 'BoardReadPage', params: { boardNo: board.boardNo.toString() } }">
          취소
        </router-link>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: 'BoardModifyForm',
  props: {
    board: {
      type: Object,
      required: true
    }
  },
  data () {
    return {
      title: '',
      content: ''
    }
  },
  methods: {
    onSubmit () {
      /* 여기 this는 위 data(){}를 말함 */
      const { title, content } = this
      // 자식 컴포넌트에서 밸류들을 바꾸고 싶다고 신호보내는것  : $emit
      this.$emit('submit', { title, content })
    }
  },
  created () {
     // 이 컨포넌트의 titledㅔ  프롭스할때 넘어온 board의 title을 다시 할당을 하겠다.
    this.title = this.board.title
    this.content = this.board.content
  }
}
</script>