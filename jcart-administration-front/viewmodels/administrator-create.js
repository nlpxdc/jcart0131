var app = new Vue({
    el: '#app',
    data: {
        username: '',
        realName: '',
        email: '',
        password: '',
        statuses: [
            {
                value: 0,
                label: '禁用'
            }, {
                value: 1,
                label: '启用'
            }
        ],
        selectedStatus: 1
    },
    methods: {
        handleCreateClick() {
            console.log('create click');
            this.createAdministrator();
        },
        createAdministrator() {
            axios.post('/administrator/create', {
                username: this.username,
                realName: this.realName,
                email: this.email,
                password: this.password,
                status: this.selectedStatus
            })
                .then(function (response) {
                    console.log(response);
                    alert('创建成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})