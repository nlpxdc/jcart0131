var app = new Vue({
    el: '#app',
    data: {
        username: '',
        password: ''
    },
    methods: {
        handleLoginClick() {
            console.log('login click');
            this.administratorLogin();
        },
        administratorLogin() {
            axios.get('/administrator/login', {
                params: {
                    username: this.username,
                    password: this.password
                }
            })
                .then(function (response) {
                    console.log(response);
                    var result = response.data;
                    localStorage['jcartToken'] = result.token;
                    alert('登陆成功');
                })
                .catch(function (error) {
                    console.error(error);
                });
        }
    }
})