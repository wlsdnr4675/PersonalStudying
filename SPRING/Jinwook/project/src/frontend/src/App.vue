<template>
<v-contetnt>
  <Header/>
  <router-view/>
</v-contetnt>
</template>
<script>
import Header from "./views/common/Header"
export default {
  name: 'App',
  components:{
    Header
  }
}
</script>