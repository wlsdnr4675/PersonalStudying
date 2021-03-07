<template>
<v-content>
  <Header/>
   <router-view/>
</v-content>
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

<style >
#app{
  font-family: 'NanumSquare', sans-serif !important;
  font-weight: bold;
}
</style>