import biz.entreprise.agile.crm.security.*
class BootStrap {

    def createRequestMap(){
          for (String url in [
                '/', \
                '/index', \
                '/index.gsp', \
                '/**/favicon.ico',
                '/assets/**', \
                '/**/js/**', \
                '/**/css/**', \
                '/**/images/**',
                '/login', \
                '/login.*', \
                '/login/*',
                '/logout', \
                '/logout.*', \
                '/logout/*']) {
            
            log.debug "test"
           new Requestmap(url: url, configAttribute: 'permitAll').save(flush: true)
        }        
        new Requestmap(url: '/profile/**',    configAttribute: 'ROLE_USER').save(flush: true)
        new Requestmap(url: '/admin/**',      configAttribute: 'ROLE_ADMIN').save(flush: true)
        new Requestmap(url: '/admin/role/**', configAttribute: 'ROLE_SUPERVISOR').save(flush: true)
        new Requestmap(url: '/admin/user/**', configAttribute: 'ROLE_ADMIN,ROLE_SUPERVISOR').save(flush: true)
        new Requestmap(url: '/j_spring_security_switch_user',configAttribute: 'ROLE_SWITCH_USER,isFullyAuthenticated()').save(flush: true)        
        
        new Requestmap(url: '/screen/authenticatedPage', configAttribute: 'IS_AUTHENTICATED_FULLY').save(flush: true)
        new Requestmap(url: '/screen/commonPage', configAttribute: 'ROLE_COMMON').save(flush: true)
        new Requestmap(url: '/screen/royalPage', configAttribute: 'ROLE_ROYALTY').save(flush: true)
        new Requestmap(url: '/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save(flush: true)        
        
    }
    def init = { servletContext ->
     
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
        def testUser = new User(username: 'me', password: 'password') 
        testUser.save(flush: true)
    
        UserRole.create testUser, adminRole, true
        assert User.count() == 1 
        assert Role.count() == 2 
        assert UserRole.count() == 1 
        
        createRequestMap()
     
    }

    def destroy = {
    }
}
