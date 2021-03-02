<template>
<MainPageLayout>
    <template #menubar>
        <div class="gnb-left">
            <v-btn @click="home()">Indiedog</v-btn>
        </div> 
        <div class="gnb-center">
            <v-btn @click="start('society')">All Game</v-btn>
            <v-btn @click="start('society')">Cloud Game</v-btn>
            <v-btn @click="Community()">Community</v-btn>
        </div>
        <div class="gnb-right">
        <v-btn @click="home()" text color="white">Language</v-btn>
        <v-btn @click="home()" text color="white">Totalmenu</v-btn>
        <v-btn @click="home()" text color="white">Login</v-btn>
        </div>
    </template>
</MainPageLayout>
</template>

<script>
import MainPageLayout from "@/views/common/MainPageLayout"
import router from "@/router";
    export default {
        name: "Home",
        components: {MainPageLayout},

        methods: {
            home(){
                (window.location.pathname !== '/') ? router.push('/') : router.go(0)
            }
        }
        
    }
</script>
<style scoped>
.gnb-left{
    float: left;
    width: 20%;
    margin-left: 10px;
    color: saddlebrown;
}
.gnb-center{
    width: 40%;
    color: black;
}
.gnb-rigth{
    float: right;
}
</style>